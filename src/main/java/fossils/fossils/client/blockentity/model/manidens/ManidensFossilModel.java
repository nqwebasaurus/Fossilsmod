package fossils.fossils.client.blockentity.model.manidens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ManidensFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Manidens;
	private final ModelPart hips;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart rightArm;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public ManidensFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Manidens = this.fossil.getChild("Manidens");
		this.hips = this.Manidens.getChild("hips");
		this.LegL = this.hips.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.LegL2 = this.hips.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL2 = this.MetatarsalL2.getChild("FootL2");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.ElbowL = this.leftArm.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.rightArm = this.chest.getChild("rightArm");
		this.ElbowL2 = this.rightArm.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Manidens = fossil.addOrReplaceChild("Manidens", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 5.0F));

		PartDefinition hips = Manidens.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, -0.4908F, 0.4311F, -0.0175F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.2F, -0.4433F, -2.7988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.4107F, -0.2093F, -0.0444F, 0.1918F, -0.0085F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 29).mirror().addBox(-0.5F, 0.4071F, -1.4184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7556F, 0.0388F, -0.6021F, 0.0F, -0.3316F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(-0.5F, -0.2598F, -0.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7556F, 0.0388F, -0.4276F, 0.0F, -0.3316F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 26).mirror().addBox(-0.5F, 0.4845F, 0.1306F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 11).mirror().addBox(-0.5F, -0.1155F, 0.1306F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7556F, 0.0388F, -0.8639F, 0.0F, -0.3316F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 35).mirror().addBox(-2.2F, -0.1F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 35).addBox(0.2F, -0.1F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2064F, 0.7246F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 20).mirror().addBox(-0.5F, -2.1932F, -1.4641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 20).addBox(3.5F, -2.1932F, -1.4641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.8908F, 0.2789F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 36).addBox(-0.8F, -0.4433F, -2.7988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.4107F, -0.2093F, -0.0444F, -0.1918F, 0.0085F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 29).addBox(-0.5F, 0.4071F, -1.4184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.7556F, 0.0388F, -0.6021F, 0.0F, 0.3316F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 26).addBox(-0.5F, 0.4845F, 0.1306F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 11).addBox(-0.5F, -0.1155F, 0.1306F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.0F, 0.7556F, 0.0388F, -0.8639F, 0.0F, 0.3316F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 11).addBox(-0.5F, -0.2598F, -0.4749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.7556F, 0.0388F, -0.4276F, 0.0F, 0.3316F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 15).addBox(0.0F, -0.6404F, 0.7068F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 30).addBox(-0.5F, -0.2404F, -0.2932F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7535F, -1.5286F, -0.2531F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 0.925F, -0.0821F, -0.8696F, 0.05F, 0.121F));

		PartDefinition cube_r12 = LegL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 0).addBox(1.0F, 0.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0015F, -0.1905F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r13 = LegL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 42).addBox(0.5F, -0.8078F, -0.2768F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3743F, -0.2748F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r14 = LegL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 45).addBox(0.5F, -0.0533F, 0.0002F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 3.4743F, -1.2748F, 0.0785F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4387F, -0.3215F, 0.6877F, 0.0271F, -0.1281F));

		PartDefinition cube_r15 = KneeL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 38).addBox(-0.6F, 2.819F, 13.7012F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 37).addBox(-1.6F, 2.819F, 13.3012F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 10.5256F, -9.4025F, 1.0647F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0039F, 5.8485F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r16 = MetatarsalL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 7).addBox(-1.6F, -13.6584F, -6.5978F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 12.8453F, -6.9877F, -0.9599F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0345F, 2.0111F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r17 = FootL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -2.0202F, 10.0369F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.5108F, -6.7987F, 0.9599F, 0.0F, 0.0F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 0.925F, -0.0821F, 0.1298F, 0.017F, -0.1298F));

		PartDefinition cube_r18 = LegL2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-1.0F, 0.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.0015F, -0.1905F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r19 = LegL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(-1.5F, -0.8078F, -0.2768F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.3743F, -0.2748F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r20 = LegL2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-1.5F, -0.0533F, 0.0002F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.4743F, -1.2748F, 0.0785F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4387F, -0.3215F, -0.0964F, 0.145F, 0.1421F));

		PartDefinition cube_r21 = KneeL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 38).mirror().addBox(-0.4F, 2.819F, 13.7012F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(34, 37).mirror().addBox(0.6F, 2.819F, 13.3012F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5256F, -9.4025F, 1.0647F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0039F, 5.8485F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r22 = MetatarsalL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.4F, -13.6584F, -6.5978F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.8453F, -6.9877F, -0.9599F, 0.0F, 0.0F));

		PartDefinition FootL2 = MetatarsalL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0345F, 2.0111F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r23 = FootL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.0F, -2.0202F, 10.0369F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.5108F, -6.7987F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -0.4505F, -0.0198F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8465F, 3.6714F, -0.0987F, 0.0808F, -0.0421F));

		PartDefinition cube_r24 = tail1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, -0.3F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 38).addBox(0.0F, -0.3F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 37).addBox(0.0F, -0.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(0.0F, -0.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 49).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5505F, -0.0198F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 7).addBox(0.0F, 2.0F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0F, 1.0F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 15).addBox(0.0F, 0.0F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 15).addBox(0.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1578F, 0.433F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0495F, 8.8802F, 0.628F, 0.5057F, 0.228F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(22, 5).addBox(0.0F, -0.2007F, 6.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 26).addBox(0.0F, -0.2007F, 4.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(0.0F, -0.2007F, 2.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 25).addBox(0.0F, -0.2007F, 0.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4066F, 1.0645F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 15).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2934F, 1.0645F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 5).addBox(0.0F, 7.0F, 14.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, 6.0F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(0.0F, 5.0F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(0.0F, 3.0F, 8.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1059F, -8.4785F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3934F, 9.0645F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2791F, 0.9445F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5209F, 11.8445F, -0.4674F, -0.3542F, 0.1733F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6535F, -1.7286F, -0.2376F, -0.1273F, 0.0307F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 5).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -6.2749F, 0.3523F, 0.3062F, -0.8963F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -6.2749F, 0.4381F, 0.1532F, -0.5243F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 5).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -4.2749F, 0.2689F, 0.2031F, -0.9173F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 42).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -4.2749F, 0.3245F, 0.0868F, -0.538F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.174F, -2.2749F, 0.2155F, 0.1335F, -0.9263F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 7).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.174F, -2.2749F, 0.2495F, 0.0419F, -0.5428F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 32).mirror().addBox(-1.9321F, -0.3737F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.174F, -0.2749F, 0.0589F, -0.0765F, -0.9308F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(10, 43).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.174F, -0.2749F, 0.025F, -0.0932F, -0.537F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(6, 36).mirror().addBox(-3.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.174F, -2.2749F, 0.1299F, 0.2176F, -1.4065F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 37).mirror().addBox(-4.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -4.2749F, 0.1448F, 0.3037F, -1.4026F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(37, 14).mirror().addBox(-5.4282F, -1.6854F, -0.7245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.374F, -6.2749F, 0.1689F, 0.4327F, -1.394F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(50, 32).addBox(0.9321F, -0.3737F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.174F, -0.2749F, 0.0589F, 0.0765F, 0.9308F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(10, 43).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.174F, -0.2749F, 0.025F, 0.0932F, 0.537F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 11).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.174F, -2.2749F, 0.2155F, -0.1335F, 0.9263F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(6, 36).addBox(2.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.174F, -2.2749F, 0.1299F, -0.2176F, 1.4065F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(49, 7).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.174F, -2.2749F, 0.2495F, -0.0419F, 0.5428F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(28, 5).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -4.2749F, 0.2689F, -0.2031F, 0.9173F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(45, 37).addBox(2.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -4.2749F, 0.1448F, -0.3037F, 1.4026F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 42).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -4.2749F, 0.3245F, -0.0868F, 0.538F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(31, 50).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -6.2749F, 0.4381F, -0.1532F, 0.5243F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 5).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -6.2749F, 0.3523F, -0.3062F, 0.8963F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 14).addBox(2.4282F, -1.6854F, -0.7245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.374F, -6.2749F, 0.1689F, -0.4327F, 1.394F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 51).addBox(0.0F, 1.1F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 51).addBox(0.0F, 1.1F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 52).addBox(0.0F, 1.1F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 52).addBox(0.0F, 1.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-0.5F, 1.5F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2921F, -6.4001F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3921F, -6.8001F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6166F, -3.5096F, 0.3812F, 0.3402F, -0.8871F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6166F, -3.5096F, 0.4765F, 0.1749F, -0.5181F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2166F, -1.5096F, 0.3523F, 0.3062F, -0.8963F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2166F, -1.5096F, 0.4381F, 0.1532F, -0.5243F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-6.4282F, -1.6854F, -0.7245F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2166F, -1.5096F, 0.1689F, 0.4327F, -1.394F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(16, 5).mirror().addBox(-0.009F, 1.0886F, 1.3694F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.552F, -4.9062F, 0.373F, -0.7696F, -0.4955F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-5.4282F, -1.6854F, -0.7245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6166F, -3.5096F, 0.1775F, 0.4756F, -1.3902F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 32).mirror().addBox(-0.4269F, 0.4326F, 2.173F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.552F, -4.9062F, 0.0274F, -0.577F, -0.4335F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 46).mirror().addBox(-1.4F, -0.7798F, 0.1263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(32, 46).addBox(0.4F, -0.7798F, 0.1263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 4.552F, -4.9062F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(27, 13).mirror().addBox(0.0F, -0.2974F, -1.983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.1773F, -4.2347F, 0.7072F, -0.6925F, -0.4995F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-3.0F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2443F, -2.2134F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(16, 5).addBox(-0.991F, 1.0886F, 1.3694F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.552F, -4.9062F, 0.373F, 0.7696F, 0.4955F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5731F, 0.4326F, 2.173F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.552F, -4.9062F, 0.0274F, 0.577F, 0.4335F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(27, 13).addBox(-1.0F, -0.2974F, -1.983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, 3.1773F, -4.2347F, 0.7072F, 0.6925F, 0.4995F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 15).addBox(2.0F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2443F, -2.2134F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(15, 21).addBox(2.4282F, -1.6854F, -0.7245F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6166F, -3.5096F, 0.1775F, -0.4756F, 1.3902F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(32, 20).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6166F, -3.5096F, 0.3812F, -0.3402F, 0.8871F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(50, 10).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6166F, -3.5096F, 0.4765F, -0.1749F, 0.5181F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(16, 11).addBox(2.4282F, -1.6854F, -0.7245F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2166F, -1.5096F, 0.1689F, -0.4327F, 1.394F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(37, 16).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2166F, -1.5096F, 0.3523F, -0.3062F, 0.8963F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(50, 27).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2166F, -1.5096F, 0.4381F, -0.1532F, 0.5243F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(25, 51).addBox(0.0F, -1.2341F, 0.8634F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 51).addBox(0.0F, -1.3341F, 2.8634F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.9341F, -0.1366F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1985F, -4.7349F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.5985F, -3.3349F, -0.1511F, -0.3573F, -0.7424F));

		PartDefinition cube_r76 = leftArm.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 20).addBox(-0.5F, -0.8962F, -1.7659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 1.4637F, 0.4294F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftArm.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 21).addBox(2.4F, -12.0334F, 8.0882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 0.659F, -14.5532F, -0.8901F, 0.0F, 0.0F));

		PartDefinition ElbowL = leftArm.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.259F, 1.8468F, -0.1136F, -0.1998F, 0.0882F));

		PartDefinition cube_r78 = ElbowL.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 46).addBox(0.5F, -9.8508F, 8.7413F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, 5.5273F, -11.8503F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r79 = ElbowL.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 41).addBox(0.5F, -10.5508F, 8.0913F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 5.4273F, -12.1503F, -0.384F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.5273F, -1.6503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r80 = HandL.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(16, 48).addBox(0.7765F, -0.4024F, -0.0849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.0131F, -0.1003F, 0.1766F, 0.0704F, 0.2377F));

		PartDefinition cube_r81 = HandL.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(7, 21).addBox(-1.4579F, -10.2436F, 9.5735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 6.4869F, -12.7003F, -0.3065F, 0.078F, 0.1946F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.5985F, -3.3349F, -0.5538F, 0.0118F, 1.0003F));

		PartDefinition cube_r82 = rightArm.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(27, 20).mirror().addBox(-0.5F, -0.8962F, -1.7659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.4637F, 0.4294F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightArm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-3.4F, -12.0334F, 8.0882F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8F, 0.659F, -14.5532F, -0.8901F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = rightArm.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.259F, 1.8468F, -0.4653F, 0.4763F, -0.2263F));

		PartDefinition cube_r84 = ElbowL2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 46).mirror().addBox(-1.5F, -9.8508F, 8.7413F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5273F, -11.8503F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r85 = ElbowL2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.5F, -10.5508F, 8.0913F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.4273F, -12.1503F, -0.384F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.5273F, -1.6503F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r86 = HandL2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-1.7765F, -0.4024F, -0.0849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, -0.0131F, -0.1003F, 0.1766F, -0.0704F, -0.2377F));

		PartDefinition cube_r87 = HandL2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(7, 21).mirror().addBox(0.4579F, -10.2436F, 9.5735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 6.4869F, -12.7003F, -0.3065F, -0.078F, -0.1946F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6349F, -0.3079F, -0.1248F, 0.0396F));

		PartDefinition cube_r88 = neck1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(3, 51).addBox(0.0F, -1.1272F, 0.9265F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(0.0F, -1.2272F, 2.9265F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 26).addBox(-0.5F, -0.9272F, -0.0735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.301F, -3.8564F, -0.2356F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.701F, -3.5564F, -0.3414F, -0.0741F, -0.2054F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(36, 50).addBox(0.0F, -0.2769F, -0.1021F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 51).addBox(0.0F, -0.2769F, 1.8979F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(39, 37).addBox(-0.5F, -0.0769F, -0.1021F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.4F, -1.5F, -0.8814F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r90 = neck3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 3).addBox(-0.5F, -0.2945F, -0.3229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.3F, -0.6458F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.46F, -0.1956F, -0.2315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 49).addBox(1.56F, -0.1956F, -0.2315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.05F, -0.8339F, -0.4071F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-0.46F, -0.7615F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(49, 18).addBox(1.56F, -0.7615F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.05F, -0.3339F, -1.4071F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(49, 46).mirror().addBox(-0.46F, -0.7152F, -0.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 46).addBox(1.56F, -0.7152F, -0.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.05F, 0.1517F, -1.5829F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(12, 29).mirror().addBox(-0.46F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(12, 29).mirror().addBox(-0.16F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(12, 29).addBox(1.56F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.05F, -0.2483F, -0.9829F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-1.7F, -1.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 33).addBox(0.3F, -1.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.9347F, 0.4957F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(20, 45).addBox(-0.4F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 0.0527F, -1.0377F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(7, 15).mirror().addBox(-1.7F, -1.4F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 15).addBox(0.3F, -1.4F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.1568F, -0.8616F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-1.0F, 0.6F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 0).addBox(-0.4F, 0.6F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.3871F, -1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 9).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(37, 9).addBox(-0.4F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(-0.3F, -0.4826F, -1.1144F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 13).addBox(-0.5F, -0.0191F, -1.0652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.7347F, -6.0043F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 24).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0653F, -5.5043F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(8, 49).mirror().addBox(-0.38F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.9542F, -5.4936F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-0.38F, -0.2203F, -0.1418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.7542F, -5.6936F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-0.0801F, 0.6944F, 1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.384F, -0.2793F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.1199F, 0.4661F, 0.0012F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 14).mirror().addBox(-0.0801F, 0.1661F, 0.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.0524F, -0.2793F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 49).mirror().addBox(-0.0801F, 0.0443F, -0.5134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.5061F, -0.2793F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(6, 38).mirror().addBox(-0.1641F, -0.4688F, -0.5136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.2564F, -0.1949F, 0.023F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 40).mirror().addBox(-0.3747F, -0.6665F, 0.8169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.5411F, -0.2739F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.2948F, -0.4462F, 0.7874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.5847F, -0.2739F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 7).mirror().addBox(-0.2948F, 0.3256F, 1.0428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.3752F, -0.2739F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.3141F, -0.6629F, 1.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 48).mirror().addBox(-0.1041F, -0.6629F, 1.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.192F, -0.2739F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.3747F, 1.3483F, 0.2041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 1.405F, -0.2739F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(0.2874F, -0.9147F, 1.2499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.351F, -0.3433F, -0.0867F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.2337F, -0.2993F, -0.1797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4463F, 0.4608F, -4.8476F, 0.6806F, -0.3222F, -0.3509F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(38, 0).addBox(-0.7663F, -0.2993F, -0.1797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.6806F, 0.3222F, 0.3509F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -0.0418F, -1.7459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7653F, -3.9043F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(27, 40).addBox(-1.2874F, -0.9147F, 1.2499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.351F, 0.3433F, 0.0867F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(40, 30).addBox(-0.5F, -0.0681F, -1.8731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.4653F, -2.1043F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 49).addBox(-0.9199F, 0.0443F, -0.5134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.5061F, 0.2793F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1199F, 0.4661F, 0.0012F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 14).addBox(-0.9199F, 0.1661F, 0.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.0524F, 0.2793F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 2).addBox(-0.9199F, 0.6944F, 1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.384F, 0.2793F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(6, 38).addBox(-0.8359F, -0.4688F, -0.5136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.2564F, 0.1949F, -0.023F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 39).addBox(-0.62F, -0.2203F, -0.1418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.35F, 0.7542F, -5.6936F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(8, 49).addBox(-0.62F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.35F, 0.9542F, -5.4936F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(8, 0).addBox(-0.7052F, -0.4462F, 0.7874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.5847F, 0.2739F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(28, 0).addBox(-0.6253F, 1.3483F, 0.2041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 1.405F, 0.2739F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 7).addBox(-0.7052F, 0.3256F, 1.0428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.3752F, 0.2739F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(48, 21).addBox(-0.6859F, -0.6629F, 1.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 48).addBox(-0.8959F, -0.6629F, 1.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.192F, 0.2739F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(20, 40).addBox(-0.6253F, -0.6665F, 0.8169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4463F, 0.4608F, -4.8476F, 0.5411F, 0.2739F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-0.7F, -0.4299F, -1.3772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 23).addBox(0.92F, -0.4299F, -1.3772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.61F, -1.2418F, -0.5484F, -0.0524F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6347F, -0.4043F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(42, 18).mirror().addBox(-0.3355F, -0.5787F, -1.5987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.114F, 0.7138F, -1.9118F, 0.2258F, -0.2617F, 0.0069F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-0.3355F, -0.0162F, -2.9783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.114F, 0.7138F, -1.9118F, -0.1931F, -0.2617F, 0.0069F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(0.2005F, -1.9778F, -2.96F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.114F, 0.7138F, -1.9118F, 0.17F, 0.011F, -0.0352F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(3, 47).mirror().addBox(0.1273F, -0.8562F, -2.2597F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.114F, 0.7138F, -1.9118F, 0.0861F, -0.2617F, 0.0069F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-0.3355F, -0.6845F, -2.603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.114F, 0.7138F, -1.9118F, 0.0861F, -0.2617F, 0.0069F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(3, 47).addBox(-0.1273F, -0.8562F, -2.2597F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.114F, 0.7138F, -1.9118F, 0.0861F, 0.2617F, -0.0069F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 29).addBox(-1.2005F, -1.9778F, -2.96F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.114F, 0.7138F, -1.9118F, 0.17F, -0.011F, 0.0352F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(42, 18).addBox(-0.6645F, -0.5787F, -1.5987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.114F, 0.7138F, -1.9118F, 0.2258F, 0.2617F, -0.0069F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 43).addBox(-0.6645F, -0.0162F, -2.9783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.114F, 0.7138F, -1.9118F, -0.1931F, 0.2617F, -0.0069F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(16, 0).addBox(-0.6645F, -0.6845F, -2.603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.114F, 0.7138F, -1.9118F, 0.0861F, 0.2617F, -0.0069F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 45).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2138F, -5.1201F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-1.5F, -0.9929F, -1.2351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(45, 28).addBox(0.5F, -0.9929F, -1.2351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.7138F, -1.1201F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-1.5F, -1.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 25).addBox(0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1138F, -0.6201F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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