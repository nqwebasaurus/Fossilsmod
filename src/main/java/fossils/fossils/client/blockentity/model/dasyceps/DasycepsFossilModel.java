package fossils.fossils.client.blockentity.model.dasyceps;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DasycepsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Dasyceps;
	private final ModelPart Basin;
	private final ModelPart FemurR2;
	private final ModelPart Tibia_FibulaR2;
	private final ModelPart PesR2;
	private final ModelPart FemurR3;
	private final ModelPart Tibia_FibulaR3;
	private final ModelPart PesR3;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Neck2;
	private final ModelPart Cephalon2;
	private final ModelPart Cranium2;
	private final ModelPart Jaw2;
	private final ModelPart ForearmL3;
	private final ModelPart Radio_UlnaL3;
	private final ModelPart ManusL3;
	private final ModelPart ForearmL4;
	private final ModelPart Radio_UlnaL4;
	private final ModelPart ManusL4;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;

	public DasycepsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Dasyceps = this.fossil.getChild("Dasyceps");
		this.Basin = this.Dasyceps.getChild("Basin");
		this.FemurR2 = this.Basin.getChild("FemurR2");
		this.Tibia_FibulaR2 = this.FemurR2.getChild("Tibia_FibulaR2");
		this.PesR2 = this.Tibia_FibulaR2.getChild("PesR2");
		this.FemurR3 = this.Basin.getChild("FemurR3");
		this.Tibia_FibulaR3 = this.FemurR3.getChild("Tibia_FibulaR3");
		this.PesR3 = this.Tibia_FibulaR3.getChild("PesR3");
		this.Body2 = this.Basin.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Neck2 = this.Body3.getChild("Neck2");
		this.Cephalon2 = this.Neck2.getChild("Cephalon2");
		this.Cranium2 = this.Cephalon2.getChild("Cranium2");
		this.Jaw2 = this.Cephalon2.getChild("Jaw2");
		this.ForearmL3 = this.Body3.getChild("ForearmL3");
		this.Radio_UlnaL3 = this.ForearmL3.getChild("Radio_UlnaL3");
		this.ManusL3 = this.Radio_UlnaL3.getChild("ManusL3");
		this.ForearmL4 = this.Body3.getChild("ForearmL4");
		this.Radio_UlnaL4 = this.ForearmL4.getChild("Radio_UlnaL4");
		this.ManusL4 = this.Radio_UlnaL4.getChild("ManusL4");
		this.Tail1 = this.Basin.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Dasyceps = fossil.addOrReplaceChild("Dasyceps", CubeListBuilder.create(), PartPose.offset(-1.2F, -10.0F, 3.0F));

		PartDefinition Basin = Dasyceps.addOrReplaceChild("Basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5F, 0.6F, 0.1309F, 0.1745F, 0.0F));

		PartDefinition Basin_r1 = Basin.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.1249F, -1.2793F, -0.5384F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6412F, 0.4773F, 0.8083F, -0.1647F, -0.05F, -0.3897F));

		PartDefinition Basin_r2 = Basin.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0412F, 0.4773F, 0.8083F, -0.1647F, 0.05F, 0.3897F));

		PartDefinition Basin_r3 = Basin.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(11, 45).addBox(-1.5072F, 0.0041F, 1.8107F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5974F, -2.7392F, -0.1332F, -0.012F, -0.0074F));

		PartDefinition Basin_r4 = Basin.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(15, 52).addBox(-0.5F, -2.7958F, -0.1912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5974F, -2.7392F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 37).mirror().addBox(-4.8742F, 0.1387F, 11.2699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(-4.5286F, 0.1864F, 7.2838F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -2.0584F, -8.8474F, -0.1668F, 0.0648F, -0.1452F));

		PartDefinition cube_r2 = Basin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 38).mirror().addBox(-3.2765F, -0.3121F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4191F, 0.2001F, 0.9797F, -0.1491F, -0.0638F, -0.1281F));

		PartDefinition cube_r3 = Basin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-5.81F, -2.2433F, 7.3475F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -2.0584F, -8.8474F, -0.1715F, -0.0482F, -0.7014F));

		PartDefinition cube_r4 = Basin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 37).addBox(0.6032F, 0.4424F, 11.4704F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 35).addBox(0.2576F, 0.4901F, 7.4844F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0584F, -8.8474F, -0.1668F, -0.0648F, 0.1452F));

		PartDefinition cube_r5 = Basin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 38).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9809F, 0.2001F, 0.9797F, -0.1491F, 0.0638F, 0.1281F));

		PartDefinition cube_r6 = Basin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 59).addBox(2.055F, -0.7665F, 7.5173F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0584F, -8.8474F, -0.1715F, 0.0482F, 0.7014F));

		PartDefinition FemurR2 = Basin.addOrReplaceChild("FemurR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 1.7669F, 0.2694F, 0.324F, -0.3548F, -0.7365F));

		PartDefinition cube_r7 = FemurR2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 12).addBox(-1.3F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(3.7F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6491F, 0.7718F, 0.9914F, -0.2295F, -0.2556F, 0.5177F));

		PartDefinition Tibia_FibulaR2 = FemurR2.addOrReplaceChild("Tibia_FibulaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0491F, 2.7718F, 1.9914F, -0.5116F, -0.8554F, 0.4579F));

		PartDefinition cube_r8 = Tibia_FibulaR2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 18).addBox(0.0F, -0.6F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(35, 45).addBox(0.1F, 0.6F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6672F, -0.167F, 1.4693F));

		PartDefinition PesR2 = Tibia_FibulaR2.addOrReplaceChild("PesR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.6638F, -0.2768F, -0.1718F));

		PartDefinition cube_r9 = PesR2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 45).addBox(-2.0F, -0.6F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.2269F));

		PartDefinition FemurR3 = Basin.addOrReplaceChild("FemurR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.15F, 1.7669F, 0.2694F, -0.7006F, -0.5571F, 1.0716F));

		PartDefinition cube_r10 = FemurR3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 12).mirror().addBox(-3.7F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 31).mirror().addBox(-4.7F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6491F, 0.7718F, 0.9914F, -0.2295F, 0.2556F, -0.5177F));

		PartDefinition Tibia_FibulaR3 = FemurR3.addOrReplaceChild("Tibia_FibulaR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0491F, 2.7718F, 1.9914F, -0.3969F, 0.8736F, -0.297F));

		PartDefinition cube_r11 = Tibia_FibulaR3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-3.0F, -0.6F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(35, 45).mirror().addBox(-3.1F, 0.6F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6672F, 0.167F, -1.4693F));

		PartDefinition PesR3 = Tibia_FibulaR3.addOrReplaceChild("PesR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.5526F, 0.0635F, -0.1256F));

		PartDefinition cube_r12 = PesR3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 45).mirror().addBox(-3.0F, -0.6F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, -0.2269F));

		PartDefinition Body2 = Basin.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8436F, -2.4906F, 0.0853F, -0.173F, 0.023F));

		PartDefinition cube_r13 = Body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 29).mirror().addBox(-6.5607F, -2.3103F, 5.3529F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 8).mirror().addBox(-6.6048F, -2.4936F, 3.3394F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 41).mirror().addBox(-6.5726F, -2.6127F, 1.3332F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 15).mirror().addBox(-6.3877F, -2.6034F, -0.6582F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -1.1249F, -6.3993F, -0.1715F, -0.0482F, -0.7014F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-4.3263F, -0.0123F, 5.2928F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 37).mirror().addBox(-4.4336F, -0.1514F, 3.278F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(-4.4422F, -0.2774F, 1.272F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 42).mirror().addBox(-4.2533F, -0.377F, -0.7165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -1.1249F, -6.3993F, -0.1668F, 0.0648F, -0.1452F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 10).addBox(0.0552F, 0.2914F, 5.4933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 37).addBox(0.1626F, 0.1523F, 3.4786F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(0.1711F, 0.0263F, 1.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.0178F, -0.0733F, -0.516F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1249F, -6.3993F, -0.1668F, -0.0648F, 0.1452F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 29).addBox(1.8056F, -0.8335F, 5.5227F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 8).addBox(1.8497F, -1.0168F, 3.5092F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 41).addBox(1.8175F, -1.1359F, 1.503F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 15).addBox(1.6327F, -1.1266F, -0.4884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1249F, -6.3993F, -0.1715F, 0.0482F, 0.7014F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.581F, -0.0243F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6635F, -7.849F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8171F, -7.7512F, -0.0455F, -0.1278F, 0.0285F));

		PartDefinition cube_r18 = Body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 41).addBox(-2.5F, 1.2F, 1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5328F, -5.4816F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-5.4425F, -2.5512F, -0.633F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.2371F, -0.5985F, -0.169F, -0.051F, -0.7008F));

		PartDefinition cube_r20 = Body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-4.2718F, -0.3034F, -0.6918F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.2371F, -0.5985F, -0.1661F, 0.0611F, -0.1444F));

		PartDefinition cube_r21 = Body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-5.0241F, -2.9818F, -0.6224F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.2837F, -2.6375F, -0.1587F, -0.0621F, -0.7873F));

		PartDefinition cube_r22 = Body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 22).mirror().addBox(-4.1504F, -0.8914F, -0.6772F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.2837F, -2.6375F, -0.1633F, 0.0462F, -0.2302F));

		PartDefinition cube_r23 = Body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-3.1814F, -0.6729F, -0.5391F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -0.0635F, -4.6072F, -0.1536F, 0.0044F, -0.2224F));

		PartDefinition cube_r24 = Body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-4.3223F, -2.2765F, -0.4971F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -0.0635F, -4.6072F, -0.1283F, -0.0925F, -0.7821F));

		PartDefinition cube_r25 = Body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 20).addBox(1.6868F, -1.0742F, -0.4719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2371F, -0.5985F, -0.169F, 0.051F, 0.7008F));

		PartDefinition cube_r26 = Body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2371F, -0.5985F, -0.1661F, -0.0611F, 0.1444F));

		PartDefinition cube_r27 = Body3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 48).addBox(1.4039F, -1.357F, -0.4645F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.6375F, -0.1587F, 0.0621F, 0.7873F));

		PartDefinition cube_r28 = Body3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 22).addBox(-0.0866F, -0.3904F, -0.4898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.6375F, -0.1633F, -0.0462F, 0.2302F));

		PartDefinition cube_r29 = Body3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 54).addBox(0.6975F, -0.6496F, -0.4394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0635F, -4.6072F, -0.1283F, 0.0925F, 0.7821F));

		PartDefinition cube_r30 = Body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(55, 45).addBox(-1.0619F, -0.1731F, -0.4518F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0635F, -4.6072F, -0.1536F, -0.0044F, 0.2224F));

		PartDefinition cube_r31 = Body3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-3.5F, 0.419F, -2.574F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 52).mirror().addBox(-3.5F, -0.6327F, -3.3381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 52).addBox(3.8F, -0.6327F, -3.3381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(3.8F, 0.419F, -2.574F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.2624F, -2.5552F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Body3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(-2.2626F, -0.7038F, -0.5585F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 2.3082F, -5.4083F, 1.1144F, 0.1719F, -0.0306F));

		PartDefinition cube_r33 = Body3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 51).addBox(-4.0025F, -0.3199F, -0.4484F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 2.3082F, -5.4083F, 1.1144F, -0.1719F, 0.0306F));

		PartDefinition cube_r34 = Body3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.6195F, 0.2479F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5504F, -5.2906F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Neck2 = Body3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.7064F, -5.1426F, -0.2216F, 0.1705F, -0.0362F));

		PartDefinition cube_r35 = Neck2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 35).addBox(-0.6F, -0.2011F, -0.6261F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2246F, -4.064F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Neck2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 10).mirror().addBox(-3.0743F, -0.8109F, -2.4507F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.687F, 0.6704F, 0.0F, 0.0044F, -0.2224F));

		PartDefinition cube_r37 = Neck2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 10).addBox(-0.169F, -0.3037F, -2.4409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.687F, 0.6704F, 0.0F, -0.0044F, 0.2224F));

		PartDefinition Cephalon2 = Neck2.addOrReplaceChild("Cephalon2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1489F, -4.0201F, -0.0884F, 0.2171F, -0.0305F));

		PartDefinition Cranium2 = Cephalon2.addOrReplaceChild("Cranium2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -0.6F, 0.2F, -0.1621F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Cranium2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(14, 18).addBox(-2.8376F, -0.98F, -0.1462F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8344F, 0.3953F, 1.2751F, -0.0533F, -0.094F, -0.2311F));

		PartDefinition cube_r39 = Cranium2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 45).addBox(-2.5724F, -0.3653F, -0.4316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.7782F, -1.0883F, 1.1827F, 0.0845F, -0.26F, -0.2838F));

		PartDefinition cube_r40 = Cranium2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 35).addBox(-3.7791F, -0.7782F, -0.949F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7218F, -1.0883F, 1.1827F, 0.0907F, -0.024F, -0.252F));

		PartDefinition cube_r41 = Cranium2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(36, 0).addBox(-5.9421F, -0.8232F, -1.4341F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5698F, 0.0496F, 0.1721F, -0.1157F, 0.2036F, -0.186F));

		PartDefinition cube_r42 = Cranium2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(2.2289F, -1.8662F, 0.3421F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(42, 5).addBox(0.2289F, -1.8662F, 0.3421F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-1.7711F, -1.8662F, 0.3421F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.12F, 1.4F, -6.76F, 0.001F, -0.3535F, -0.1878F));

		PartDefinition cube_r43 = Cranium2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(3, 56).mirror().addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.9538F, 1.8484F, -3.7933F, 0.0559F, 0.3454F, 0.2024F));

		PartDefinition cube_r44 = Cranium2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(1.1091F, -0.7898F, 0.9411F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 55).mirror().addBox(0.4091F, -0.4898F, 0.0411F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.38F, 1.4F, -14.96F, -0.0482F, 0.4794F, 0.0254F));

		PartDefinition cube_r45 = Cranium2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(3, 56).addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8538F, 1.8484F, -3.7933F, 0.0559F, -0.3454F, -0.2024F));

		PartDefinition cube_r46 = Cranium2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(22, 0).addBox(-0.2831F, 0.1511F, -0.9707F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7782F, -1.0883F, 1.1827F, 0.0845F, 0.26F, 0.2838F));

		PartDefinition cube_r47 = Cranium2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 27).addBox(-3.9828F, -0.5016F, -0.9966F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.5698F, 0.0496F, 0.1721F, -0.1157F, -0.2036F, 0.186F));

		PartDefinition cube_r48 = Cranium2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 52).addBox(-6.0723F, -1.4935F, -0.3385F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(44, 17).addBox(-4.0723F, -1.4935F, -0.3385F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 34).addBox(-2.0723F, -1.4935F, -0.3385F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.12F, 1.4F, -6.76F, 0.001F, 0.3535F, 0.1878F));

		PartDefinition cube_r49 = Cranium2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0702F, -0.9547F, -3.2377F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8154F, -0.2753F, -5.6666F, 0.0375F, -0.3468F, -0.2003F));

		PartDefinition cube_r50 = Cranium2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 32).addBox(-0.1418F, -0.5074F, -4.0545F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5846F, -0.2753F, -5.6666F, 0.0375F, 0.3468F, 0.2003F));

		PartDefinition cube_r51 = Cranium2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(4, 55).addBox(-0.4091F, -0.4898F, 0.0411F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-1.1091F, -0.7898F, 0.9411F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-1.4091F, -2.0898F, 0.9411F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.48F, 1.4F, -14.96F, -0.0482F, -0.4794F, -0.0254F));

		PartDefinition cube_r52 = Cranium2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(28, 12).addBox(-2.3649F, -1.9945F, 0.0225F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.52F, 1.4F, -14.96F, -0.0482F, 0.4794F, 0.0254F));

		PartDefinition cube_r53 = Cranium2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 15).addBox(-2.9696F, -1.246F, -0.9697F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.992F, 0.2397F, -3.1497F, 0.0013F, -0.0151F, -0.1739F));

		PartDefinition cube_r54 = Cranium2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 59).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.992F, 0.2397F, -3.1497F, 0.0013F, 0.0151F, 0.1739F));

		PartDefinition cube_r55 = Cranium2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(35, 51).addBox(-2.48F, -1.8243F, -4.5079F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.4F, -0.48F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Cranium2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(13, 33).addBox(-0.1572F, -0.2857F, -1.0405F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2782F, -1.0883F, 1.1827F, 0.0907F, 0.024F, 0.252F));

		PartDefinition cube_r57 = Cranium2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 0).addBox(-2.48F, -1.1558F, -0.5872F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -14.16F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Cranium2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(28, 24).addBox(-1.1006F, -0.5128F, -0.3043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8344F, 0.3953F, 1.2751F, -0.0533F, 0.094F, 0.2311F));

		PartDefinition Jaw2 = Cephalon2.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0071F, 1.944F, 1.3495F, 0.1639F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Jaw2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 35).addBox(-1.9F, -0.5F, -8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6432F, 0.3672F, -7.238F, -0.0073F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Jaw2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.7061F, -0.8343F, -0.8246F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9071F, 0.4127F, -15.0842F, 0.0023F, 0.4364F, 0.005F));

		PartDefinition cube_r61 = Jaw2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 51).addBox(-1.4939F, -0.8343F, 0.1754F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-1.8939F, -0.5343F, 0.1754F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3071F, 0.4127F, -15.0842F, 0.0023F, -0.4364F, -0.005F));

		PartDefinition cube_r62 = Jaw2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 51).addBox(-3.2226F, -0.523F, 1.0714F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7486F, 0.3819F, -5.6269F, 0.0017F, -0.3493F, -0.0086F));

		PartDefinition cube_r63 = Jaw2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5961F, -0.499F, 0.0448F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3628F, 0.3819F, -5.6269F, 0.0017F, 0.3493F, 0.0086F));

		PartDefinition cube_r64 = Jaw2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 20).addBox(-1.8249F, -0.5222F, -1.0928F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3071F, 0.4127F, -15.0842F, 0.0023F, 0.4364F, 0.005F));

		PartDefinition ForearmL3 = Body3.addOrReplaceChild("ForearmL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 1.8328F, -2.7816F, -0.534F, 0.5242F, -0.9358F));

		PartDefinition Humerus_r1 = ForearmL3.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(42, 15).addBox(-3.7443F, -1.5379F, -1.7172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 23).addBox(0.2557F, -1.5379F, -1.7172F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-2.7443F, -1.5379F, -0.9172F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2046F, 2.692F, 0.7172F, 0.3888F, 0.0566F, 0.5173F));

		PartDefinition Radio_UlnaL3 = ForearmL3.addOrReplaceChild("Radio_UlnaL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.1F, 0.7F, -0.7413F, -0.6027F, 0.5747F));

		PartDefinition Radio_Ulna_r1 = Radio_UlnaL3.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(36, 5).addBox(-0.4F, -0.4F, -0.6F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 52).addBox(0.6F, -0.4F, -2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9679F, 0.244F, -0.0594F, 1.3537F, 0.6041F, 1.4174F));

		PartDefinition ManusL3 = Radio_UlnaL3.addOrReplaceChild("ManusL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9679F, 4.544F, -2.0594F, 0.6442F, -0.0278F, 0.193F));

		PartDefinition cube_r65 = ManusL3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(40, 45).addBox(-2.5F, -0.9F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition ForearmL4 = Body3.addOrReplaceChild("ForearmL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 1.8328F, -2.7816F, 0.7196F, 0.8164F, 0.7772F));

		PartDefinition Humerus_r2 = ForearmL4.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(42, 15).mirror().addBox(2.7443F, -1.5379F, -1.7172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 23).mirror().addBox(-2.2557F, -1.5379F, -1.7172F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).mirror().addBox(-0.2557F, -1.5379F, -0.9172F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2046F, 2.692F, 0.7172F, 0.3888F, -0.0566F, -0.5173F));

		PartDefinition Radio_UlnaL4 = ForearmL4.addOrReplaceChild("Radio_UlnaL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.1F, 0.7F, -0.8172F, 0.0057F, -0.4891F));

		PartDefinition Radio_Ulna_r2 = Radio_UlnaL4.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-4.6F, -0.4F, -0.6F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 52).mirror().addBox(-4.6F, -0.4F, -2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9679F, 0.244F, -0.0594F, 1.3537F, -0.6041F, -1.4174F));

		PartDefinition ManusL4 = Radio_UlnaL4.addOrReplaceChild("ManusL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9679F, 4.544F, -2.0594F, 0.6631F, 0.2381F, -0.0353F));

		PartDefinition cube_r66 = ManusL4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(40, 45).mirror().addBox(-2.5F, -0.9F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Tail1 = Basin.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(45, 32).addBox(-0.5F, -0.3431F, -0.0931F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2016F, 3.4506F, -0.2664F, 0.2595F, -0.035F));

		PartDefinition cube_r67 = Tail1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(10, 2).mirror().addBox(-4.101F, 1.9711F, 16.8362F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 8).mirror().addBox(-4.301F, 1.9711F, 14.8362F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 0).mirror().addBox(-4.401F, 1.9711F, 12.8362F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -2.0773F, -11.9065F, 0.0F, 0.0648F, -0.1452F));

		PartDefinition cube_r68 = Tail1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 2).addBox(0.83F, 2.3039F, 16.9835F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(1.03F, 2.3039F, 14.9835F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(1.13F, 2.3039F, 12.9835F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0773F, -11.9065F, 0.0F, -0.0648F, 0.1452F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0522F, 6.9034F, 0.0083F, -0.346F, -0.0475F));

		PartDefinition cube_r69 = Tail2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(34, 35).addBox(-0.5F, -0.4015F, 0.0698F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0392F, -0.2974F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0306F, 7.5331F, 0.1473F, -0.4755F, -0.0678F));

		return LayerDefinition.create(meshdefinition, 70, 65);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}