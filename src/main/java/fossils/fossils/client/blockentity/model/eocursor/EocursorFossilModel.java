package fossils.fossils.client.blockentity.model.eocursor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EocursorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eocursor;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart PesL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart PesL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;

	public EocursorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eocursor = this.fossil.getChild("Eocursor");
		this.LegL = this.Eocursor.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.PesL = this.MetatarsalL.getChild("PesL");
		this.LegL2 = this.Eocursor.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.PesL2 = this.MetatarsalL2.getChild("PesL2");
		this.Tail1 = this.Eocursor.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Body = this.Eocursor.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eocursor = fossil.addOrReplaceChild("Eocursor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.5F, 0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Eocursor.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(32, 50).addBox(0.0F, -0.7715F, 4.0648F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 50).addBox(0.0F, -0.8715F, 2.0648F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 50).addBox(0.0F, -0.8715F, 0.0648F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 5).mirror().addBox(-1.5F, 0.0285F, 1.0648F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 5).addBox(0.5F, 0.0285F, 1.0648F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-0.5F, -0.0715F, 0.0648F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Eocursor.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-0.5F, -0.0266F, -1.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.8F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Eocursor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 33).mirror().addBox(-0.5F, -0.0373F, -0.8485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.4F, 1.2F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Eocursor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 18).mirror().addBox(-0.0466F, -0.6599F, -0.3209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3329F, 2.9588F, 1.847F, -0.429F, 0.0454F, -0.3514F));

		PartDefinition cube_r4 = Eocursor.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-0.2474F, -0.6481F, -0.7514F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.6F, -1.8F, -0.5686F, 0.0454F, -0.3514F));

		PartDefinition cube_r5 = Eocursor.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 26).mirror().addBox(-0.5035F, 0.53F, -0.9827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -1.0922F, 0.0454F, -0.3514F));

		PartDefinition cube_r6 = Eocursor.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.5035F, 0.5721F, -0.0553F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -1.3715F, 0.0454F, -0.3514F));

		PartDefinition cube_r7 = Eocursor.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-0.5035F, 0.6542F, 0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -1.738F, 0.0454F, -0.3514F));

		PartDefinition cube_r8 = Eocursor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.3429F, -0.4765F, -0.061F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 3.0F, 0.6F, -0.4464F, 0.0454F, -0.3514F));

		PartDefinition cube_r9 = Eocursor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(35, 8).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3329F, 1.7588F, 0.947F, -0.7955F, 0.0454F, -0.3514F));

		PartDefinition cube_r10 = Eocursor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 26).mirror().addBox(-0.5F, -1.6F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 26).addBox(3.3F, -1.6F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Eocursor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, -0.8764F, -1.5964F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 39).addBox(3.3F, -0.8764F, -1.5964F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Eocursor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 26).mirror().addBox(-0.6F, -0.3048F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 26).addBox(3.4F, -0.3048F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, -1.3F, -0.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Eocursor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-0.5F, -0.129F, -1.0484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(49, 6).addBox(3.3F, -0.129F, -1.0484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9F, -1.3F, 0.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Eocursor.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(-0.5F, -1.7152F, -0.2883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(42, 6).addBox(3.3F, -1.7152F, -0.2883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9F, 0.3F, 0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Eocursor.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 27).addBox(-0.5F, -0.0266F, -1.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9F, 0.3F, 0.8F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Eocursor.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 33).addBox(-0.5F, -0.0373F, -0.8485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9F, -0.4F, 1.2F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Eocursor.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 18).addBox(-0.9534F, -0.6599F, -0.3209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3329F, 2.9588F, 1.847F, -0.429F, -0.0454F, 0.3514F));

		PartDefinition cube_r18 = Eocursor.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 8).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3329F, 1.7588F, 0.947F, -0.7955F, -0.0454F, 0.3514F));

		PartDefinition cube_r19 = Eocursor.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 6).addBox(-0.7526F, -0.6481F, -0.7514F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.9F, 1.6F, -1.8F, -0.5686F, -0.0454F, 0.3514F));

		PartDefinition cube_r20 = Eocursor.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3429F, -0.4765F, -0.061F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.9F, 3.0F, 0.6F, -0.4464F, -0.0454F, 0.3514F));

		PartDefinition cube_r21 = Eocursor.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 30).addBox(-0.4965F, 0.6542F, 0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.3F, 0.2F, -1.738F, -0.0454F, 0.3514F));

		PartDefinition cube_r22 = Eocursor.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 26).addBox(-0.4965F, 0.5721F, -0.0553F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.9F, 0.3F, 0.2F, -1.3715F, -0.0454F, 0.3514F));

		PartDefinition cube_r23 = Eocursor.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 26).addBox(-0.4965F, 0.53F, -0.9827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.3F, 0.2F, -1.0922F, -0.0454F, 0.3514F));

		PartDefinition LegL = Eocursor.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(10, 44).addBox(-0.7F, 1.0868F, -0.4924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 38).addBox(-0.7F, -0.9132F, -0.8924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.9F, -0.6F, -1.7017F, 0.0F, 0.0F));

		PartDefinition Femur_r1 = LegL.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(48, 44).addBox(1.9F, -0.1018F, -0.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 4.9868F, 0.4076F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = LegL.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(7, 0).addBox(1.9F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 3.0868F, -0.4924F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = LegL.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(45, 20).addBox(1.9F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6F, 1.0868F, 0.4076F, 0.733F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create().texOffs(0, 14).addBox(0.1F, -0.0464F, -0.1438F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 5.4868F, 1.4076F, 2.3998F, 0.0F, 0.0F));

		PartDefinition Tibia_r1 = KneeL.addOrReplaceChild("Tibia_r1", CubeListBuilder.create().texOffs(20, 36).addBox(1.5F, -8.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 14).addBox(1.5F, -6.9F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.5F, 8.1536F, 0.7562F, 0.0524F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3536F, 0.6562F, -1.0385F, 0.0F, 0.0F));

		PartDefinition Metatarsals_r1 = MetatarsalL.addOrReplaceChild("Metatarsals_r1", CubeListBuilder.create().texOffs(5, 44).addBox(-0.7F, -0.8F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, 1.7972F, -2.3639F, -0.1259F, 0.036F, 0.277F));

		PartDefinition Metatarsals_r2 = MetatarsalL.addOrReplaceChild("Metatarsals_r2", CubeListBuilder.create().texOffs(13, 14).addBox(1.5F, -0.5429F, 0.3064F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.5F, -0.4F, -1.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition PesL = MetatarsalL.addOrReplaceChild("PesL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, -3.1F, 2.0944F, 0.0F, 0.0F));

		PartDefinition Pes_r1 = PesL.addOrReplaceChild("Pes_r1", CubeListBuilder.create().texOffs(23, 11).addBox(1.0F, -0.0357F, -3.5923F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.8F, -0.5F, -0.576F, 0.0F, 0.0F));

		PartDefinition LegL2 = Eocursor.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(10, 44).mirror().addBox(-0.4F, 1.0868F, -0.4924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 38).mirror().addBox(-0.4F, -0.9132F, -0.8924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.9F, -0.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = LegL2.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(48, 44).mirror().addBox(-2.9F, -0.1018F, -0.0494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 4.9868F, 0.4076F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = LegL2.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-2.9F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 3.0868F, -0.4924F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = LegL2.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-2.9F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.5F, 1.0868F, 0.4076F, 0.733F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.1F, -0.0464F, -0.1438F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4868F, 1.4076F, 0.9687F, 0.0522F, -0.0593F));

		PartDefinition Tibia_r2 = KneeL2.addOrReplaceChild("Tibia_r2", CubeListBuilder.create().texOffs(20, 36).mirror().addBox(-2.5F, -8.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 14).mirror().addBox(-2.5F, -6.9F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.5F, 8.1536F, 0.7562F, 0.0524F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3536F, 0.6562F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Metatarsals_r3 = MetatarsalL2.addOrReplaceChild("Metatarsals_r3", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-0.3F, -0.8F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.7972F, -2.3639F, -0.1259F, -0.036F, -0.277F));

		PartDefinition Metatarsals_r4 = MetatarsalL2.addOrReplaceChild("Metatarsals_r4", CubeListBuilder.create().texOffs(13, 14).mirror().addBox(-3.5F, -0.5429F, 0.3064F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(2.5F, -0.4F, -1.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition PesL2 = MetatarsalL2.addOrReplaceChild("PesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, -3.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Pes_r2 = PesL2.addOrReplaceChild("Pes_r2", CubeListBuilder.create().texOffs(23, 11).mirror().addBox(-4.0F, -0.0357F, -3.5923F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.8F, -0.5F, -0.576F, 0.0F, 0.0F));

		PartDefinition Tail1 = Eocursor.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 2.6F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition Caudalproximal_r1 = Tail1.addOrReplaceChild("Caudalproximal_r1", CubeListBuilder.create().texOffs(51, 24).addBox(0.0F, -1.6F, 4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 50).addBox(0.0F, -1.6F, 2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 50).addBox(0.0F, -1.6F, 0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 14).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7052F, 0.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Caudalproximal_r2 = Tail1.addOrReplaceChild("Caudalproximal_r2", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, 1.1967F, 3.6764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 0.68F, 1.8092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(0.0F, -0.0368F, -0.0579F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8727F, 0.9446F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8052F, 6.7F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition Caudalmedialproximal_r1 = Tail2.addOrReplaceChild("Caudalmedialproximal_r1", CubeListBuilder.create().texOffs(21, 5).addBox(-0.5F, -1.7F, 8.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -1.8F, 6.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 18).addBox(-0.5F, -1.9F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 50).addBox(-0.5F, -2.0F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 50).addBox(-0.5F, -2.0F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-1.0F, -1.3F, 0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.9F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Caudalproximal_r3 = Tail2.addOrReplaceChild("Caudalproximal_r3", CubeListBuilder.create().texOffs(51, 38).addBox(0.0F, 4.2967F, 11.3764F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 51).addBox(0.0F, 3.5967F, 9.3764F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 33).addBox(0.0F, 3.0967F, 7.3764F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 51).addBox(0.0F, 2.5967F, 5.3764F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0674F, -5.7553F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 10.1F, -0.0089F, 0.1745F, -0.0015F));

		PartDefinition Caudalmedialdistal_r1 = Tail3.addOrReplaceChild("Caudalmedialdistal_r1", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -1.3F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 5).addBox(-0.5F, -1.3F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.5F, -1.4F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-1.0F, -1.1F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4997F, -0.0174F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.8997F, 8.9826F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition Caudaldistal_r1 = Tail4.addOrReplaceChild("Caudaldistal_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, -0.4F, 0.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Body = Eocursor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -2.2F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.3655F, 0.1479F, 0.1897F, -0.8672F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 30).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.3655F, 0.0836F, 0.2253F, -1.1773F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5011F, -3.2655F, 0.3366F, 0.1884F, -0.7358F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(49, 47).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5011F, -3.2655F, 0.1755F, 0.3441F, -1.3958F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5011F, -3.2655F, 0.2665F, 0.2798F, -1.0356F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(7, 35).mirror().addBox(-4.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9011F, -5.2655F, 0.1985F, 0.3918F, -1.3875F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9011F, -5.2655F, 0.3052F, 0.3169F, -1.0242F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9011F, -5.2655F, 0.3838F, 0.2129F, -0.7264F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(16, 30).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.3655F, 0.0836F, -0.2253F, 1.1773F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.3655F, 0.1479F, -0.1897F, 0.8672F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 0).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5011F, -3.2655F, 0.2665F, -0.2798F, 1.0356F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(49, 47).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5011F, -3.2655F, 0.1755F, -0.3441F, 1.3958F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5011F, -3.2655F, 0.3366F, -0.1884F, 0.7358F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9011F, -5.2655F, 0.3838F, -0.2129F, 0.7264F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 13).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9011F, -5.2655F, 0.3052F, -0.3169F, 1.0242F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 35).addBox(2.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9011F, -5.2655F, 0.1985F, -0.3918F, 1.3875F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, -0.0705F, 0.0701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(6, 51).addBox(0.0F, -0.7705F, 1.0701F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(41, 50).addBox(0.0F, -0.7483F, 2.0618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 50).addBox(0.0F, -0.7483F, 0.0618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 32).addBox(-0.5F, -0.0483F, 0.0618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4F, -6.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 14).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.8011F, -2.2655F, 0.2487F, 0.6144F, -1.3631F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.8011F, -2.2655F, 0.5644F, 0.3596F, -0.6752F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(23, 18).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.8011F, -2.2655F, 0.4394F, 0.5078F, -0.9702F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(41, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0011F, -0.3655F, 0.4515F, 0.2704F, -0.7102F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0011F, -0.3655F, 0.3542F, 0.391F, -1.0072F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 6).mirror().addBox(-4.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0011F, -0.3655F, 0.2164F, 0.4776F, -1.3799F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(9, 29).mirror().addBox(-0.5F, -0.4401F, 0.0605F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(9, 29).addBox(4.1F, -0.4401F, 0.0605F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4F, 2.8281F, -2.0922F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(39, 16).mirror().addBox(0.0F, -0.9137F, -1.9862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 2.7779F, -2.0733F, 0.7696F, -0.3931F, -0.3554F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(39, 16).addBox(-1.0F, -0.9137F, -1.9862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 2.7779F, -2.0733F, 0.7696F, 0.3931F, 0.3554F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(23, 18).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8011F, -2.2655F, 0.4394F, -0.5078F, 0.9702F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(17, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8011F, -2.2655F, 0.5644F, -0.3596F, 0.6752F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(23, 14).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8011F, -2.2655F, 0.2487F, -0.6144F, 1.3631F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(41, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0011F, -0.3655F, 0.4515F, -0.2704F, 0.7102F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(13, 26).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0011F, -0.3655F, 0.3542F, -0.391F, 1.0072F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 6).addBox(2.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0011F, -0.3655F, 0.2164F, -0.4776F, 1.3799F));

		PartDefinition Scapulo_Coracoid_r1 = Chest.addOrReplaceChild("Scapulo_Coracoid_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-0.1F, -1.5534F, 2.9948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 51).addBox(-0.1F, -1.2534F, 0.9948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.6F, -1.0534F, -0.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.3F, 0.4189F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.0F, -1.7F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Humerus_r1 = ArmL.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(18, 23).addBox(0.0F, -0.6F, 0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 3.6F, 0.0737F, -0.0468F, 0.5655F));

		PartDefinition Radio_Ulna_r1 = ElbowL.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(26, 19).addBox(0.0F, -1.3662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(27, 0).addBox(0.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.2F, 0.0F, 0.8378F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1F, -2.7F));

		PartDefinition Manus_r1 = HandL.addOrReplaceChild("Manus_r1", CubeListBuilder.create().texOffs(46, 24).addBox(-1.1F, -0.7083F, -1.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 1.4508F, 0.1855F, 0.21F));

		PartDefinition Manus_r2 = HandL.addOrReplaceChild("Manus_r2", CubeListBuilder.create().texOffs(41, 0).addBox(-1.1F, -0.9083F, -2.0051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.8574F, 0.1855F, 0.21F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 4.0F, -1.7F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Humerus_r2 = ArmL2.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(18, 23).mirror().addBox(-1.0F, -0.6F, 0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 3.6F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition Radio_Ulna_r2 = ElbowL2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(26, 19).mirror().addBox(-1.0F, -1.3662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(27, 0).mirror().addBox(-1.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2F, 0.0F, 0.8378F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1F, -2.7F));

		PartDefinition Manus_r3 = HandL2.addOrReplaceChild("Manus_r3", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(0.1F, -0.7083F, -1.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 1.4508F, -0.1855F, -0.21F));

		PartDefinition Manus_r4 = HandL2.addOrReplaceChild("Manus_r4", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(0.1F, -0.9083F, -2.0051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.8574F, -0.1855F, -0.21F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.3F, -0.1355F, -0.2595F, 0.035F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(41, 40).addBox(-1.1F, -0.9313F, -0.0487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(35, 35).addBox(-1.1F, 1.6568F, -3.0613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, 1.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(26, 43).addBox(-0.7F, -0.6083F, -1.8286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -1.6F, -2.2F, 0.25F, -0.2116F, -0.0536F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.0255F, -1.2389F, -0.0344F, -0.0061F, -0.1744F));

		PartDefinition Squamosal_r1 = Head.addOrReplaceChild("Squamosal_r1", CubeListBuilder.create().texOffs(43, 44).addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.53F, 1.9227F, -4.156F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r1 = Head.addOrReplaceChild("Premaxillary_r1", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-0.5F, -0.5169F, -0.1248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(14, 47).addBox(0.1F, -0.5169F, -0.1248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.3091F, -2.2733F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r2 = Head.addOrReplaceChild("Premaxillary_r2", CubeListBuilder.create().texOffs(24, 47).mirror().addBox(-0.5F, -0.2155F, -0.7544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 47).addBox(0.1F, -0.2155F, -0.7544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.6091F, -2.3733F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r3 = Head.addOrReplaceChild("Premaxillary_r3", CubeListBuilder.create().texOffs(35, 29).mirror().addBox(-0.5F, -0.2699F, -0.2842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5936F, -4.4759F, 0.824F, -0.0832F, -0.0896F));

		PartDefinition Premaxillary_r4 = Head.addOrReplaceChild("Premaxillary_r4", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, -0.2609F, -0.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.0F, 1.6936F, -4.6759F, 1.0647F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r5 = Head.addOrReplaceChild("Premaxillary_r5", CubeListBuilder.create().texOffs(47, 3).addBox(-0.5F, -0.2116F, -0.8401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.2936F, -4.2759F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r6 = Head.addOrReplaceChild("Premaxillary_r6", CubeListBuilder.create().texOffs(35, 29).addBox(-0.5F, -0.2699F, -0.2842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.5936F, -4.4759F, 0.824F, 0.0832F, 0.0896F));

		PartDefinition Premaxillary_r7 = Head.addOrReplaceChild("Premaxillary_r7", CubeListBuilder.create().texOffs(20, 30).addBox(-0.5F, -0.3683F, -0.7052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 1.9936F, -4.4759F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Squamosal_r2 = Head.addOrReplaceChild("Squamosal_r2", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 47).mirror().addBox(-0.4F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.511F, -0.9532F, -0.4285F, 0.0F, 0.1222F, 1.5708F));

		PartDefinition Squamosal_r3 = Head.addOrReplaceChild("Squamosal_r3", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-0.5F, -0.932F, -0.2176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(44, 47).addBox(0.56F, -0.932F, -0.2176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.53F, 0.2452F, -1.093F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Squamosal_r4 = Head.addOrReplaceChild("Squamosal_r4", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.7851F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 48).addBox(0.56F, -0.7851F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.53F, 0.6452F, -0.793F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Squamosal_r5 = Head.addOrReplaceChild("Squamosal_r5", CubeListBuilder.create().texOffs(44, 15).mirror().addBox(-0.5412F, -0.3134F, -0.7141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3888F, 0.1582F, -1.895F, 0.4116F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r6 = Head.addOrReplaceChild("Squamosal_r6", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.506F, -0.8218F, -0.1138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.4462F, 0.5763F, -1.4835F, 1.3017F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r7 = Head.addOrReplaceChild("Squamosal_r7", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.5362F, -0.1204F, -0.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.3428F, -2.0191F, 0.2196F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r8 = Head.addOrReplaceChild("Squamosal_r8", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-0.5859F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(48, 41).mirror().addBox(-0.4229F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5271F, 0.2376F, -2.1102F, 0.4105F, -0.1259F, -0.0169F));

		PartDefinition Squamosal_r9 = Head.addOrReplaceChild("Squamosal_r9", CubeListBuilder.create().texOffs(39, 47).mirror().addBox(-0.2033F, -0.9399F, -0.6961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, 0.3394F, -2.0734F, 1.2284F, -0.2809F, -0.0998F));

		PartDefinition Squamosal_r10 = Head.addOrReplaceChild("Squamosal_r10", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3882F, 1.1506F, -2.9143F, 0.0816F, -0.1679F, -0.099F));

		PartDefinition Squamosal_r11 = Head.addOrReplaceChild("Squamosal_r11", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.13F, 1.8812F, -4.4573F, 0.9512F, 0.0F, 0.0F));

		PartDefinition Squamosal_r12 = Head.addOrReplaceChild("Squamosal_r12", CubeListBuilder.create().texOffs(29, 47).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.13F, 1.8812F, -4.4573F, 0.9512F, 0.0F, 0.0F));

		PartDefinition Squamosal_r13 = Head.addOrReplaceChild("Squamosal_r13", CubeListBuilder.create().texOffs(34, 47).addBox(-0.6F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 47).addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.511F, -0.9532F, -0.4285F, 0.0F, -0.1222F, -1.5708F));

		PartDefinition Squamosal_r14 = Head.addOrReplaceChild("Squamosal_r14", CubeListBuilder.create().texOffs(34, 47).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3882F, 1.1506F, -2.9143F, 0.0816F, 0.1679F, 0.099F));

		PartDefinition Squamosal_r15 = Head.addOrReplaceChild("Squamosal_r15", CubeListBuilder.create().texOffs(39, 47).addBox(-0.7967F, -0.9399F, -0.6961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7508F, 0.3394F, -2.0734F, 1.2284F, 0.2809F, 0.0998F));

		PartDefinition Squamosal_r16 = Head.addOrReplaceChild("Squamosal_r16", CubeListBuilder.create().texOffs(48, 0).addBox(-0.494F, -0.8218F, -0.1138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.4462F, 0.5763F, -1.4835F, 1.3017F, 0.1049F, 0.0511F));

		PartDefinition Squamosal_r17 = Head.addOrReplaceChild("Squamosal_r17", CubeListBuilder.create().texOffs(20, 45).addBox(-0.4141F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(48, 41).addBox(-0.5771F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5271F, 0.2376F, -2.1102F, 0.4105F, 0.1259F, 0.0169F));

		PartDefinition Squamosal_r18 = Head.addOrReplaceChild("Squamosal_r18", CubeListBuilder.create().texOffs(38, 44).addBox(-0.4638F, -0.1204F, -0.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4064F, -0.3428F, -2.0191F, 0.2196F, 0.1049F, 0.0511F));

		PartDefinition Squamosal_r19 = Head.addOrReplaceChild("Squamosal_r19", CubeListBuilder.create().texOffs(44, 15).addBox(-0.4588F, -0.3134F, -0.7141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3888F, 0.1582F, -1.895F, 0.4116F, 0.1049F, 0.0511F));

		PartDefinition Squamosal_r20 = Head.addOrReplaceChild("Squamosal_r20", CubeListBuilder.create().texOffs(5, 48).addBox(-0.2F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0002F)), PartPose.offsetAndRotation(-0.1F, -0.4867F, -1.1664F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r1 = Head.addOrReplaceChild("Quadratojugal_r1", CubeListBuilder.create().texOffs(41, 34).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(41, 34).addBox(0.1F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.417F, -0.9569F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Squamosal_r21 = Head.addOrReplaceChild("Squamosal_r21", CubeListBuilder.create().texOffs(48, 17).mirror().addBox(-1.0F, 0.0001F, -0.8568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.9867F, 0.0336F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Squamosal_r22 = Head.addOrReplaceChild("Squamosal_r22", CubeListBuilder.create().texOffs(19, 48).mirror().addBox(-1.0F, 0.002F, -0.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(19, 48).addBox(-0.4F, 0.002F, -0.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.063F, -0.8874F, 0.192F, 0.0F, 0.0F));

		PartDefinition Squamosal_r23 = Head.addOrReplaceChild("Squamosal_r23", CubeListBuilder.create().texOffs(48, 17).addBox(0.0F, 0.0001F, -0.8568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2F, -0.9867F, 0.0336F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r2 = Head.addOrReplaceChild("Quadratojugal_r2", CubeListBuilder.create().texOffs(7, 6).mirror().addBox(-0.8F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(7, 6).addBox(0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.3F, 0.6144F, 0.0536F, 0.733F, 0.0F, 0.0F));

		PartDefinition Jugal_r1 = Head.addOrReplaceChild("Jugal_r1", CubeListBuilder.create().texOffs(33, 44).mirror().addBox(-0.8F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(33, 44).addBox(-0.4F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.567F, -2.0512F, 0.576F, 0.0F, 0.0F));

		PartDefinition Teeth_r1 = Head.addOrReplaceChild("Teeth_r1", CubeListBuilder.create().texOffs(15, 44).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1982F, 2.0076F, -4.2639F, 0.4712F, 0.0167F, 0.0055F));

		PartDefinition Teeth_r2 = Head.addOrReplaceChild("Teeth_r2", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(0.334F, 1.4204F, -3.112F, 0.4743F, 0.11F, 0.0532F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0779F, 0.9272F));

		PartDefinition AntiorbitalAirSinus_r1 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r1", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(-0.6183F, -0.2139F, -2.6234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7396F, 0.1419F, -3.4468F, 0.6832F, -0.1506F, -0.0526F));

		PartDefinition AntiorbitalAirSinus_r2 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r2", CubeListBuilder.create().texOffs(35, 3).mirror().addBox(-0.6709F, -0.8091F, -2.7278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.698F, 1.1782F, -2.9222F, 0.4225F, -0.1275F, -0.0571F));

		PartDefinition AntiorbitalAirSinus_r3 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r3", CubeListBuilder.create().texOffs(34, 23).addBox(-0.3817F, -0.2139F, -2.6234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2604F, 0.1419F, -3.4468F, 0.6832F, 0.1506F, 0.0526F));

		PartDefinition AntiorbitalAirSinus_r4 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r4", CubeListBuilder.create().texOffs(35, 3).addBox(-0.3291F, -0.8091F, -2.7278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 1.1782F, -2.9222F, 0.4225F, 0.1275F, 0.0571F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0779F, 0.9272F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5147F, 0.0603F, -2.7074F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Crest_r1 = BrowL.addOrReplaceChild("Crest_r1", CubeListBuilder.create().texOffs(14, 40).mirror().addBox(-0.4F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1778F, 0.2405F, -0.1382F, 0.7508F, -0.2221F, -0.4138F));

		PartDefinition Crest_r2 = BrowL.addOrReplaceChild("Crest_r2", CubeListBuilder.create().texOffs(14, 40).addBox(-0.6F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1483F, 0.2405F, -0.1382F, 0.7508F, 0.2221F, 0.4138F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9779F, 0.3272F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Predentary_r1 = Jaw.addOrReplaceChild("Predentary_r1", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(49, 30).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.5675F, -3.7174F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Angular_r1 = Jaw.addOrReplaceChild("Angular_r1", CubeListBuilder.create().texOffs(21, 41).mirror().addBox(-0.5F, -0.8088F, -1.7716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(21, 41).addBox(0.5F, -0.8088F, -1.7716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.3935F, -0.279F, 0.733F, 0.0F, 0.0F));

		PartDefinition Angular_r2 = Jaw.addOrReplaceChild("Angular_r2", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(-0.5F, -0.7293F, 0.5291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(42, 11).addBox(0.5F, -0.7293F, 0.5291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0F, 1.1935F, -1.679F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Surangular_r1 = Jaw.addOrReplaceChild("Surangular_r1", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.5F, -0.2312F, -0.7667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(47, 10).addBox(0.5F, -0.2312F, -0.7667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.2959F, -1.5971F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Squamosal_r24 = Jaw.addOrReplaceChild("Squamosal_r24", CubeListBuilder.create().texOffs(10, 49).mirror().addBox(-0.61F, 0.9F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.03F, 1.0226F, -4.6554F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Surangular_r2 = Jaw.addOrReplaceChild("Surangular_r2", CubeListBuilder.create().texOffs(7, 40).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 40).addBox(0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3959F, -1.0971F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Teeth_r3 = Jaw.addOrReplaceChild("Teeth_r3", CubeListBuilder.create().texOffs(26, 25).addBox(-0.4695F, -0.2404F, -1.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.4695F, 1.6091F, -3.0876F, 0.8477F, 0.0F, 0.0F));

		PartDefinition Teeth_r4 = Jaw.addOrReplaceChild("Teeth_r4", CubeListBuilder.create().texOffs(34, 40).addBox(-0.4695F, -0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.4695F, 1.6091F, -2.9876F, 0.6383F, 0.0F, 0.0F));

		PartDefinition Squamosal_r25 = Jaw.addOrReplaceChild("Squamosal_r25", CubeListBuilder.create().texOffs(10, 49).addBox(-0.39F, 0.9F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.03F, 1.0226F, -4.6554F, 0.5323F, 0.0F, 0.0F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5808F, 0.9268F));

		PartDefinition Dentary_r1 = JawslopeL.addOrReplaceChild("Dentary_r1", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-0.4712F, -0.7941F, -0.3019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6958F, 2.7653F, -3.4814F, 0.6075F, -0.0998F, -0.0982F));

		PartDefinition Dentary_r2 = JawslopeL.addOrReplaceChild("Dentary_r2", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-0.6775F, -0.2359F, -2.6496F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6958F, 1.3653F, -2.7814F, 0.7471F, -0.0998F, -0.0982F));

		PartDefinition Dentary_r3 = JawslopeL.addOrReplaceChild("Dentary_r3", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5288F, -0.7941F, -0.3019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3042F, 2.7653F, -3.4814F, 0.6075F, 0.0998F, 0.0982F));

		PartDefinition Dentary_r4 = JawslopeL.addOrReplaceChild("Dentary_r4", CubeListBuilder.create().texOffs(15, 0).addBox(-0.3225F, -0.2359F, -2.6496F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3042F, 1.3653F, -2.7814F, 0.7471F, 0.0998F, 0.0982F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5808F, 0.9268F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -2.3808F, 1.6268F));

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