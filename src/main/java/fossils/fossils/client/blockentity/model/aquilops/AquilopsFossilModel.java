package fossils.fossils.client.blockentity.model.aquilops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AquilopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftleg4;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightleg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftarm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public AquilopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftleg4 = this.leftleg3.getChild("leftleg4");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightleg4 = this.rightleg3.getChild("rightleg4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftarm3 = this.leftarm2.getChild("leftarm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightarm3 = this.rightarm2.getChild("rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -3.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 63).addBox(0.0F, -1.6984F, 2.0634F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 63).addBox(0.0F, -1.2984F, 0.0634F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 2.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 13).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).mirror().addBox(-2.5F, -0.5F, 2.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(16, 7).mirror().addBox(-1.5F, 0.0F, 2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 0).addBox(1.5F, -0.5F, 2.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(16, 7).addBox(0.5F, 0.0F, 2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -2.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-0.5F, -7.0782F, -1.788F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4473F, 1.5334F, -2.7925F, 0.0F, -0.2967F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 59).mirror().addBox(-0.5F, -5.6491F, -1.0399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4473F, 1.5334F, -2.6529F, 0.0F, -0.2967F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.5F, -1.145F, -0.5577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4473F, 1.5334F, -2.9671F, 0.0F, -0.2967F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.5F, -3.1676F, 0.0872F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4473F, 1.5334F, -2.2689F, 0.0F, -0.2967F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 42).mirror().addBox(-0.5F, -3.9369F, -0.377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0527F, -1.2666F, -2.1642F, 0.1745F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-0.5F, -1.4533F, -0.5868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0527F, -1.2666F, -2.2515F, 0.1745F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 32).mirror().addBox(-0.5F, -0.0826F, 0.0411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0527F, -0.0666F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 59).mirror().addBox(-0.5F, -0.7016F, -0.4252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3527F, -0.5666F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).addBox(3.5F, -1.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3565F, 0.7506F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(0.0F, -0.0962F, -3.012F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 0).addBox(4.0F, -0.0962F, -3.012F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.2F, 5.4F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(0.0F, -0.046F, -3.9609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -2.4F, -0.5F, 0.1965F, 0.2141F, 0.0423F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(0.0F, -0.0834F, -2.9756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(40, 29).addBox(4.0F, -0.0834F, -2.9756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, -2.1F, 2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.046F, -3.9609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -2.4F, -0.5F, 0.1965F, -0.2141F, -0.0423F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 42).addBox(-0.5F, -3.9369F, -0.377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0F, -0.0527F, -1.2666F, -2.1642F, -0.1745F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 61).addBox(-0.5F, -7.0782F, -1.788F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.4473F, 1.5334F, -2.7925F, 0.0F, 0.2967F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 59).addBox(-0.5F, -5.6491F, -1.0399F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0F, 0.4473F, 1.5334F, -2.6529F, 0.0F, 0.2967F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -1.145F, -0.5577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0F, 0.4473F, 1.5334F, -2.9671F, 0.0F, 0.2967F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(53, 53).addBox(-0.5F, -3.1676F, 0.0872F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.4473F, 1.5334F, -2.2689F, 0.0F, 0.2967F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, -1.4533F, -0.5868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.0527F, -1.2666F, -2.2515F, -0.1745F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -0.7016F, -0.4252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.3527F, -0.5666F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(61, 32).addBox(-0.5F, -0.0826F, 0.0411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, -1.0527F, -0.0666F, -1.117F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.2435F, 0.4809F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftleg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 29).addBox(-0.5F, 3.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(23, 1).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(0.5F, 3.0043F, -0.4655F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftleg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 49).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.021F))
				.texOffs(0, 60).addBox(-0.5F, 1.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.5F, -0.5957F, 0.3345F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftleg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 61).addBox(0.0F, -0.4913F, -0.9976F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2043F, 0.5345F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 2.0683F, -0.0968F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 49).addBox(-0.5F, 0.0683F, -0.3968F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6698F, 0.3859F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftleg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5F, -0.2036F, -0.2444F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1F, 3.7683F, 0.2032F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftleg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 58).addBox(-0.5F, -2.7F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 2.6683F, 0.3032F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.038F, -0.7986F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.1127F, 0.6494F, -0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg4 = leftleg3.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(14, 15).addBox(-1.0F, 0.0F, -4.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.538F, -0.7986F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.2435F, 0.4809F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightleg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 29).mirror().addBox(-0.5F, 3.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(23, 1).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.021F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0043F, -0.4655F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 49).mirror().addBox(-0.5F, -0.4F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.021F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.5F, 1.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5957F, 0.3345F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightleg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(0.0F, -0.4913F, -0.9976F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2043F, 0.5345F, 0.8029F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, 2.0683F, -0.0968F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 49).mirror().addBox(-0.5F, 0.0683F, -0.3968F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6698F, 0.3859F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightleg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-0.5F, -0.2036F, -0.2444F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.7683F, 0.2032F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightleg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-0.5F, -2.7F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.6683F, 0.3032F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, 0.038F, -0.7986F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.1127F, 0.6494F, -0.9338F, 0.0F, 0.0F));

		PartDefinition rightleg4 = rightleg3.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(14, 15).mirror().addBox(-3.0F, 0.0F, -4.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 4.538F, -0.7986F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -3.0F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 53).addBox(0.0F, -1.7661F, 0.1004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.8F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 63).addBox(0.0F, -1.6832F, 0.003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -3.7F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(63, 57).addBox(0.0F, -1.5998F, -0.077F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 43).addBox(-1.0F, -0.014F, -3.1763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.6F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(42, 20).addBox(-1.0F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3438F, -5.077F, 0.2576F, 0.0905F, -0.283F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -3.277F, 0.1402F, 0.0558F, -0.3614F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, -0.4014F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(-4.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0366F, -0.0238F, -1.5005F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 44).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, -0.925F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-6.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -3.277F, -0.0029F, 0.1653F, -1.4632F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -3.277F, 0.0882F, 0.14F, -0.8809F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(11, 12).mirror().addBox(-7.1316F, -1.9799F, -0.5218F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3438F, -5.077F, 0.0195F, 0.2855F, -1.3884F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 20).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3438F, -5.077F, 0.1744F, 0.228F, -0.7952F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3438F, -5.077F, 0.2576F, -0.0905F, 0.283F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 20).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3438F, -5.077F, 0.1744F, -0.228F, 0.7952F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(11, 12).addBox(2.1316F, -1.9799F, -0.5218F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3438F, -5.077F, 0.0195F, -0.2855F, 1.3884F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(49, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -3.277F, 0.1402F, -0.0558F, 0.3614F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(38, 0).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -3.277F, 0.0882F, -0.14F, 0.8809F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 34).addBox(2.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -3.277F, -0.0029F, -0.1653F, 1.4632F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(11, 43).addBox(2.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0366F, 0.0238F, 1.5005F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(31, 44).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, 0.925F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(15, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, 0.4014F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -6.6F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -1.3535F, 0.0778F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.9F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 64).addBox(0.0F, -1.6339F, -0.0083F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.5F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -0.077F, 0.342F, 0.1145F, -0.3092F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -0.077F, 0.2382F, 0.2898F, -0.8138F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-7.1316F, -1.9799F, -0.5218F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0438F, -0.077F, 0.0365F, 0.3713F, -1.4178F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 8).mirror().addBox(-5.1316F, -1.9799F, -0.5218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7438F, -3.677F, 0.0608F, 0.7817F, -1.6726F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0438F, -1.877F, 0.3875F, 0.4213F, -0.814F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(23, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0438F, -1.877F, 0.5292F, 0.1642F, -0.3355F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 25).mirror().addBox(-6.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0438F, -1.877F, 0.0785F, 0.5595F, -1.4512F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 45).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7438F, -3.677F, 0.535F, 0.6033F, -0.9515F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7438F, -3.677F, 0.7302F, 0.2694F, -0.5023F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(22, 8).addBox(2.1316F, -1.9799F, -0.5218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7438F, -3.677F, 0.0608F, -0.7817F, 1.6726F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 45).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7438F, -3.677F, 0.535F, -0.6033F, 0.9515F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(5, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7438F, -3.677F, 0.7302F, -0.2694F, 0.5023F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(23, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0438F, -1.877F, 0.5292F, -0.1642F, 0.3355F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 16).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0438F, -1.877F, 0.3875F, -0.4213F, 0.814F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(42, 25).addBox(2.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0438F, -1.877F, 0.0785F, -0.5595F, 1.4512F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(11, 0).addBox(2.1316F, -1.9799F, -0.5218F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -0.077F, 0.0365F, -0.3713F, 1.4178F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 25).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -0.077F, 0.2382F, -0.2898F, 0.8138F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0438F, -0.077F, 0.342F, -0.1145F, 0.3092F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.2818F, -0.8339F, 0.2074F, -0.4781F, -0.1154F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 24).mirror().addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.2818F, -0.8339F, 0.011F, -0.5739F, -0.0593F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.2818F, -0.8339F, 0.204F, -0.6961F, -0.061F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(46, 5).mirror().addBox(-1.5F, 0.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 5).addBox(0.5F, 0.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4092F, -1.8121F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 37).mirror().addBox(0.0F, -0.9448F, -3.0172F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.6672F, -2.529F, 1.0109F, -0.3933F, -0.5488F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-0.5F, -0.9766F, -1.9196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.4328F, 1.271F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-0.5F, -0.0286F, -0.1862F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 12).addBox(5.5F, -0.0286F, -0.1862F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.8672F, -1.629F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(28, 17).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(28, 17).addBox(5.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0F, 0.3672F, -0.629F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(53, 46).addBox(-0.5F, -0.9766F, -1.9196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.4328F, 1.271F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(30, 37).addBox(-1.0F, -0.9448F, -3.0172F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.6672F, -2.529F, 1.0109F, 0.3933F, 0.5488F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(22, 33).addBox(-1.0F, -0.9916F, 0.0687F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.8F, -2.2F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(42, 12).addBox(0.0F, -1.5332F, -0.1792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2818F, -0.8339F, 0.2074F, 0.4781F, 0.1154F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(35, 24).addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2818F, -0.8339F, 0.011F, 0.5739F, 0.0593F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(48, 10).addBox(-0.5F, 0.004F, -0.0134F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2818F, -0.8339F, 0.204F, 0.6961F, 0.061F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 54).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5F, -4.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(53, 14).addBox(-0.7191F, -0.2412F, 1.6708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(48, 48).addBox(-0.7191F, -0.5412F, -0.3292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 4.375F, -2.05F, -1.4193F, 0.2409F, -0.1896F));

		PartDefinition cube_r93 = leftarm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 22).addBox(2.0F, -0.3F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7191F, -0.1412F, 2.7708F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(48, 53).addBox(-0.5F, -0.0285F, -0.4819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 53).addBox(-0.5F, -0.0285F, -1.2819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2691F, 0.6088F, 5.9708F, 0.3487F, 0.0057F, -0.1308F));

		PartDefinition leftarm3 = leftarm2.addOrReplaceChild("leftarm3", CubeListBuilder.create().texOffs(10, 36).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, 0.7418F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-0.2809F, -0.2412F, 1.6708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(48, 48).mirror().addBox(-0.2809F, -0.5412F, -0.3292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 4.375F, -2.05F, -1.2011F, -0.2409F, 0.1896F));

		PartDefinition cube_r94 = rightarm.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-3.0F, -0.3F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7191F, -0.1412F, 2.7708F, -0.2443F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(48, 53).mirror().addBox(-0.5F, -0.0285F, -0.4819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 53).mirror().addBox(-0.5F, -0.0285F, -1.2819F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2691F, 0.6088F, 5.9708F, 0.4702F, 0.1001F, -0.1942F));

		PartDefinition rightarm3 = rightarm2.addOrReplaceChild("rightarm3", CubeListBuilder.create().texOffs(10, 36).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, -0.4363F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.9F, 0.2956F, -0.5093F, -0.0849F));

		PartDefinition cube_r95 = neck3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 43).addBox(0.0F, -1.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, -0.1304F, 0.1013F, 0.2148F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 8).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, -1.2F, -0.7505F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -1.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -1.5F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 54).addBox(-1.0F, -0.2F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.2729F, -0.6706F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -0.7F, -0.1745F, 0.0436F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.6213F, -0.3398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 4.9392F, -8.1424F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 57).addBox(-0.5F, -0.3382F, -0.279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 4.4392F, -9.4424F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 4.5392F, -8.5424F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.3468F, -0.2607F, -1.3011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.2373F, 3.8351F, -9.2352F, 1.9613F, -0.1188F, 0.0159F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(51, 0).addBox(-0.6532F, -0.2607F, -1.3011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2373F, 3.8351F, -9.2352F, 1.9613F, 0.1188F, -0.0159F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 20).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2487F, 3.2556F, -8.3362F, 1.0149F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 17).mirror().addBox(-0.3311F, -0.5488F, -0.045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2373F, 3.8351F, -9.2352F, 1.0238F, -0.1437F, -0.0835F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(39, 40).mirror().addBox(-0.2F, 0.0984F, 0.1534F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.4F, -8.7F, 0.828F, -0.0323F, -0.2731F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(48, 17).addBox(-0.6689F, -0.5488F, -0.045F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2373F, 3.8351F, -9.2352F, 1.0238F, 0.1437F, 0.0835F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(41, 57).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.0603F, -7.1242F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 43).addBox(-0.5F, 0.6F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 27).addBox(-1.0F, 1.2F, -6.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(13, 30).addBox(-1.0F, 0.9F, -6.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 21).addBox(-0.5F, -0.9426F, -0.9717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.7F, -5.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(39, 40).addBox(-0.8F, 0.0984F, 0.1534F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4F, 2.4F, -8.7F, 0.828F, 0.0323F, 0.2731F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(39, 34).addBox(-0.4926F, -0.0164F, -0.1341F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, -8.5F, 0.821F, 0.035F, 0.0389F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(61, 7).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2498F, 2.8403F, -8.389F, 2.4758F, -0.1743F, -0.1056F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.812F, -1.8016F, -2.84F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8F, -4.9F, -0.4065F, -0.4297F, 0.8551F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(61, 37).mirror().addBox(-0.773F, -1.4548F, 4.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8F, -5.0F, -0.2251F, -0.4895F, 0.7546F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-0.773F, -1.7971F, -0.0479F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8F, -5.0F, -0.0854F, -0.4895F, 0.7546F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(3, 48).mirror().addBox(-0.5F, -0.1531F, -1.8542F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.0343F, -0.2997F, 0.2904F, -0.2231F, 0.2519F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-2.6F, -0.5005F, -0.5218F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 58).addBox(1.6F, -0.5005F, -0.5218F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8581F, -0.4405F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(34, 46).mirror().addBox(-0.0523F, 0.045F, -0.0632F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4589F, -2.7261F, -0.8463F, 0.9065F, 0.778F, 0.5714F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(0.2278F, -0.5F, -0.5776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4387F, -2.2092F, -1.3583F, 1.7353F, 1.0393F, 1.761F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 54).mirror().addBox(-0.0956F, -0.7F, -1.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1387F, -2.2092F, -0.9583F, 2.5218F, 0.5341F, 2.7931F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-0.5985F, -0.5F, -0.4511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4387F, -2.2092F, -1.3583F, 2.5666F, -0.4041F, -2.8921F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(56, 33).mirror().addBox(-0.8808F, -0.5F, -1.0719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4387F, -2.2092F, -1.3583F, 2.5625F, -0.4187F, -2.8817F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(0.2063F, -0.5F, -0.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4387F, -2.2092F, -1.3583F, 1.8073F, -1.0306F, -1.8448F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-0.6F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 2).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5589F, -1.3261F, -2.9463F, 0.4307F, -0.4306F, -0.1419F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-1.1207F, -0.5F, -0.7176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4387F, -2.2092F, -1.3583F, 0.5619F, -0.3526F, -0.2141F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-0.1F, -1.3022F, -0.9544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1F, -3.7F, 2.3973F, -0.1743F, -0.1056F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(28, 17).mirror().addBox(-0.1F, -1.6303F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1F, -3.7F, 1.9435F, -0.1743F, -0.1056F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 37).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.9425F, -5.9578F, 0.8846F, -0.377F, -0.4224F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(5, 39).mirror().addBox(-0.1F, -2.7044F, -1.9477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(48, 59).mirror().addBox(-0.1F, -2.7044F, -1.1477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1F, -3.7F, 1.4722F, -0.1743F, -0.1056F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(37, 6).mirror().addBox(-0.1F, -1.1345F, -2.4692F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(14, 45).mirror().addBox(-0.63F, -0.9345F, -1.8692F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
				.texOffs(10, 50).mirror().addBox(-0.3F, -0.9345F, -1.8692F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1F, -3.7F, 0.4076F, -0.1743F, -0.1056F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(3, 48).addBox(-1.5F, -0.1531F, -1.8542F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.0343F, -0.2997F, 0.2904F, 0.2231F, -0.2519F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, 0.0681F, -0.3632F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, -1.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 47).addBox(-1.2278F, -0.5F, -0.5776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4387F, -2.2092F, -1.3583F, 1.7353F, -1.0393F, -1.761F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(43, 5).addBox(-0.4015F, -0.5F, -0.4511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4387F, -2.2092F, -1.3583F, 2.5666F, 0.4041F, 2.8921F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(58, 54).addBox(-0.9044F, -0.7F, -1.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1387F, -2.2092F, -0.9583F, 2.5218F, -0.5341F, -2.7931F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(56, 33).addBox(-0.1192F, -0.5F, -1.0719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4387F, -2.2092F, -1.3583F, 2.5625F, 0.4187F, 2.8817F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(56, 38).addBox(-1.2063F, -0.5F, -0.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4387F, -2.2092F, -1.3583F, 1.8073F, 1.0306F, 1.8448F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(57, 24).addBox(0.1207F, -0.5F, -0.7176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4387F, -2.2092F, -1.3583F, 0.5619F, 0.3526F, 0.2141F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(29, 33).addBox(-2.0F, -0.0676F, 3.0916F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(10, 22).addBox(-2.0F, 0.9324F, 3.0916F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -6.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(34, 46).addBox(-1.9477F, 0.045F, -0.0632F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4589F, -2.7261F, -0.8463F, 0.9065F, -0.778F, -0.5714F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(57, 50).addBox(-0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 2).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5589F, -1.3261F, -2.9463F, 0.4307F, 0.4306F, 0.1419F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(61, 7).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2498F, 2.8403F, -8.389F, 2.4758F, 0.1743F, 0.1056F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 39).addBox(-0.9F, -2.7044F, -1.9477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(48, 59).addBox(-0.9F, -2.7044F, -1.1477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8F, -0.1F, -3.7F, 1.4722F, 0.1743F, 0.1056F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(26, 24).addBox(-0.9F, -1.3022F, -0.9544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8F, -0.1F, -3.7F, 2.3973F, 0.1743F, 0.1056F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(28, 17).addBox(-0.9F, -1.6303F, -1.3812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8F, -0.1F, -3.7F, 1.9435F, 0.1743F, 0.1056F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(14, 45).addBox(-1.37F, -0.9345F, -1.8692F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F))
				.texOffs(10, 50).addBox(-0.7F, -0.9345F, -1.8692F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.23F))
				.texOffs(37, 6).addBox(-0.9F, -1.1345F, -2.4692F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.8F, -0.1F, -3.7F, 0.4076F, 0.1743F, 0.1056F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 37).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.9425F, -5.9578F, 0.8846F, 0.377F, 0.4224F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-0.8F, -0.0676F, -0.9084F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 50).addBox(-0.2F, -0.0676F, -0.9084F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -6.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(28, 8).mirror().addBox(-1.1F, -0.5F, -1.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7239F, -4.3659F, 0.4028F, -0.0803F, -0.0342F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(28, 8).addBox(-0.9F, -0.5F, -1.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.7239F, -4.3659F, 0.4028F, 0.0803F, 0.0342F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(19, 39).addBox(-0.188F, -1.8016F, -2.84F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 2.8F, -4.9F, -0.4065F, 0.4297F, -0.8551F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(61, 37).addBox(-0.227F, -1.4548F, 4.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 2.8F, -5.0F, -0.2251F, 0.4895F, -0.7546F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 25).addBox(-0.227F, -1.7971F, -0.0479F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 2.8F, -5.0F, -0.0854F, 0.4895F, -0.7546F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, 0.0F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(16, 36).mirror().addBox(-1.0F, -0.99F, -0.3454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 36).addBox(0.0F, -0.99F, -0.3454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5691F, -5.5389F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.6F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 56).addBox(-0.4F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8691F, -5.4389F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 14).mirror().addBox(-0.3425F, -0.6126F, -0.3273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4338F, 3.6247F, -6.3121F, -0.1636F, -0.158F, -0.0117F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-0.4F, -0.2806F, -0.8048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.0421F, -7.0692F, -0.2705F, -0.2269F, 0.0F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(29, 54).mirror().addBox(-0.7F, -0.5575F, -0.4028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 3.2352F, -6.8975F, -0.0985F, -0.2258F, 0.0221F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.2352F, -6.2975F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.4F, -0.3724F, -0.4046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.0421F, -7.0692F, 0.48F, -0.2269F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-0.8F, -0.7F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 3).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(53, 59).addBox(0.8F, -0.7F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 3).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6586F, -4.7713F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-1.0F, -0.9474F, -1.9752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(10, 56).addBox(0.0F, -0.9474F, -1.9752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1F, -3.1F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-1.0F, -1.0153F, -1.9865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 12).addBox(1.0F, -1.0153F, -1.9865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.2F, -1.3F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-1.0F, -1.0071F, -2.0078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 42).addBox(3.0F, -1.0071F, -2.0078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.7F, 0.1F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-1.0F, -2.0438F, 0.2802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5F, -3.5F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(60, 28).mirror().addBox(-1.0F, -0.0438F, -0.0198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -3.5F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(26, 58).mirror().addBox(-1.0F, -0.0206F, -0.0118F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -2.9F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(22, 30).mirror().addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(22, 30).addBox(3.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, 1.503F, -2.2228F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 39).mirror().addBox(-2.5F, -0.3F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 29).mirror().addBox(-2.5F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(25, 39).addBox(1.5F, -0.3F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 29).addBox(1.5F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(11, 14).addBox(-0.6575F, -0.6126F, -0.3273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4338F, 3.6247F, -6.3121F, -0.1636F, 0.158F, 0.0117F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 36).addBox(-0.6F, -0.2806F, -0.8048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 3.0421F, -7.0692F, -0.2705F, 0.2269F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(29, 54).addBox(-0.3F, -0.5575F, -0.4028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 3.2352F, -6.8975F, -0.0985F, 0.2258F, -0.0221F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(36, 55).addBox(-0.6F, -0.3724F, -0.4046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2F, 3.0421F, -7.0692F, 0.48F, 0.2269F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 16).addBox(0.0F, -2.0438F, 0.2802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, -3.5F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(60, 28).addBox(0.0F, -0.0438F, -0.0198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.5F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 58).addBox(0.0F, -0.0206F, -0.0118F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.1F, -2.9F, -0.4102F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 22).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.1F, -0.0089F, 0.2182F, -0.0019F));

		PartDefinition cube_r177 = tail.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(31, 63).addBox(0.0F, -2.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 63).addBox(0.0F, -2.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 40).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.9F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(35, 24).addBox(0.0F, -0.7378F, -0.394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, 4.767F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(58, 61).addBox(0.0F, 0.3F, 0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0794F, 1.0465F, 0.9338F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, -0.0323F, 0.3024F, -0.0434F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(8, 62).addBox(0.0F, -2.3F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 62).addBox(0.0F, -2.3F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 63).addBox(0.0F, -2.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 63).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(36, 37).addBox(0.0F, 4.3388F, 6.8091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 64).addBox(0.0F, 2.3698F, 4.9895F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 62).addBox(0.0F, 1.3038F, 3.194F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 0).addBox(0.0F, 0.3348F, 1.3744F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, -1.133F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3208F, 0.3024F, -0.0439F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(19, 39).addBox(0.0F, -1.1F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 29).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 40).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(8, 29).addBox(0.0F, 7.3123F, 12.4121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 29).addBox(0.0F, 6.3076F, 10.5067F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 6).addBox(0.0F, 5.4024F, 8.5908F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, -9.133F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0679F, 0.2974F, 0.0708F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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